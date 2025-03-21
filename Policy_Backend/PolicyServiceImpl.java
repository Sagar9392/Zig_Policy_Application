package com.example.demo;
import lombok.AllArgsConstructor;
import com.example.demo.PolicyDto;
import com.example.demo.ResourceNotFoundException;
import com.example.demo.PolicyMapper;
import com.example.demo.Policy;
import com.example.demo.PolicyRepository;
import com.example.demo.PolicyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PolicyServiceImpl implements PolicyService {

	@Autowired
	private PolicyRepository policyRepository;



    @Override
    public PolicyDto updatePolicy(Long policyId, PolicyDto policyDto) {

        Policy existingPolicy = policyRepository.findById(policyId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Policy not exist with id: " + policyId));

        existingPolicy.setPolicyName(policyDto.getPolicyType());
        existingPolicy.setPolicyType(policyDto.getPolicyName());
        existingPolicy.setPolicyTo(policyDto.getPolicyTo());
       
        policyRepository.save(existingPolicy);
        return PolicyMapper.mapToPolicyDto(existingPolicy);
    }

}
