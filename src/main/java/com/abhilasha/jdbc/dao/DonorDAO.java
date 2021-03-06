package com.abhilasha.jdbc.dao;

import com.abhilasha.jdbc.model.Donor;

public interface DonorDAO {
	public Donor findDonarByName(String name);
	public Donor findDonarById(int id);
	public Donor save(Donor donor);
}
