package com.admin.service;

import java.util.List;

import com.admin.exceptions.WashPackNotFoundException;
import com.admin.models.WashPacks;

public interface IAdminService {

	public WashPacks addWashPack(WashPacks packs);
	
	public List<WashPacks> findAllWashPacks();
	
	public Object updateWashPack(int id,WashPacks packs) throws WashPackNotFoundException;
	
	public String deleteWashPack(Integer id);
	
	public List<WashPacks> getWashPackById(Integer id);
	
	public List<WashPacks> getWashPackByName(String packname);
	
}
