package com.bjit.training.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bjit.training.model.Admin;
import com.bjit.training.repository.AdminRepository;

import java.util.HashSet;
import java.util.Set;

@Service("adminService")
public class AdminServiceImpl implements AdminService{
    @Autowired
    private AdminRepository adminRepository;
    
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
	@Override
	public Admin findAdminByEmail(String email) {
		// TODO Auto-generated method stub
		return adminRepository.findByEmail(email);
	}

	@Override
	public void saveAdmin(Admin admin) {
		// TODO Auto-generated method stub
		admin.setPassword(bCryptPasswordEncoder.encode(admin.getPassword()));
		adminRepository.save(admin);
	}
	
}
