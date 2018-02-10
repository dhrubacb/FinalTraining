package com.bjit.training.service;

import com.bjit.training.model.Admin;

public interface AdminService {
	public Admin findAdminByEmail(String email);
	public void saveAdmin(Admin admin);
}
