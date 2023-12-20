package com.admin.service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.admin.exceptions.WashPackNotFoundException;
import com.admin.models.WashPacks;
import com.admin.repository.WashPacksRepository;

@Service
public class AdminServiceImplementation implements IAdminService {
	
	@Autowired
	WashPacksRepository adminRepository;

	@Override
	public WashPacks addWashPack(WashPacks packs) {
		Random random=new Random();
		packs.setPackname(packs.getPackname());
		packs.setAmount(packs.getAmount());
		packs.setDescription(packs.getDescription());
		packs.setId(random.nextInt(9999));
		return adminRepository.save(packs);
	}

	@Override
	public List<WashPacks> findAllWashPacks() {
		return adminRepository.findAll();
	}

	@Override
	public Object updateWashPack(int id, WashPacks packs) throws WashPackNotFoundException {
		
		WashPacks existingPacks=adminRepository.findById(id)
				.orElseThrow(()->new WashPackNotFoundException("Not found"));
		if(packs.getId()==id) {
			existingPacks.setPackname(packs.getPackname());
			existingPacks.setDescription(packs.getDescription());
			existingPacks.setAmount(packs.getAmount());
		}
		return adminRepository.save(existingPacks);
	}

	@Override
	public String deleteWashPack(Integer id) {
		adminRepository.deleteById(id);
		return "Deleted";
	}

}
