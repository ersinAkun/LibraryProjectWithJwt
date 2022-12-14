package com.lib.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.lib.controller.dto.AddBookRequestDTO;
import com.lib.controller.dto.LoginRequest;
import com.lib.controller.dto.RegisterRequest;
import com.lib.controller.dto.UpdateRequestDTO;
import com.lib.domain.Role;
import com.lib.domain.User;
import com.lib.domain.enums.UserRole;
import com.lib.exception.ConflictException;
import com.lib.exception.ResourceNotFoundException;
import com.lib.repository.RoleRepository;
import com.lib.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	RoleRepository roleRepository;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	
	
	public void registerUser(com.lib.controller.dto.RegisterRequest request) {

        if(userRepository.existsByUserMail(request.getUserMail())) {
            throw new ConflictException("User is already registered ");
        }

         Role role  = roleRepository.findByName(UserRole.ROLE_USER).orElseThrow(
                 ()-> new ResourceNotFoundException("Role Not Found "));
        Set<Role> roles = new HashSet<>();
        roles.add(role);
        User user = new User();
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setUserMail(request.getUserMail());
        user.setPhoneNumber(request.getPhoneNumber());
        user.setRoles(roles);
        user.setPassword(passwordEncoder.encode(request.getPassword()));

        userRepository.save(user);
    }



	public  List<User> getAll() {
		
		return userRepository.findAll();
	}

	public User findUserByMailUser(LoginRequest request) {
        return userRepository.findByUserMail(request.getUserMail()).
        orElseThrow(()-> new ResourceNotFoundException("User not found with mail : " + request.getUserMail()));
    }	


	public void deleteUser(Long id) {
		 User user = findUser(id);
         userRepository.delete(user);
	}
    
	// find user by id
	public User findUser(Long id) {
        return userRepository.findById(id).
        orElseThrow(()-> new ResourceNotFoundException("User not found with id : " + id));
    }

	public void updateUser(Long id, UpdateRequestDTO updateRequestDTO) {

	    boolean emailExist=    userRepository.existsByUserMail(updateRequestDTO.getUserMail());//boolean de??er d??necek//db de yeni girilen email var m??yok mu bak??yoruz.
	    //false d??nerse yani bu email ??nceden db de yokmu?? demek.
	    User user= findUser(id);//burada da user in di??er bilgilerini ald??k. ??uan login olan kullan??c??n??n

	    //email exist mi? ve anl??k olarak gelen kullan??c??ya m?? ait bunun kontrol??n?? yapal??m
	    if (emailExist && !updateRequestDTO.getUserMail().equals(user.getUserMail())) {//yeni email db de var m???
	        throw new ConflictException("email is already exist");//yeni diye girdi??i email eskiden var m??yd???

	    }
	    user.setFirstName(updateRequestDTO.getFirstName());
	    user.setLastName(updateRequestDTO.getLastName());
	    user.setUserMail(updateRequestDTO.getUserMail());
	    //user.setPassword(updateRequestDTO.getPassword());
	    user.setPhoneNumber(updateRequestDTO.getPhoneNumber());
	    user.setPassword(passwordEncoder.encode(updateRequestDTO.getPassword()));
	    userRepository.save(user);

	    }






	
	
}
