package com.example.demo;
import lombok.AllArgsConstructor;
import com.example.demo.PolicyDto;
import com.example.demo.ResourceNotFoundException;
import com.example.demo.Policy;
import com.example.demo.PolicyRepository;
import com.example.demo.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/policy")
public class PolicyController {

	 @Autowired
    private PolicyService policyService;

   
    @PutMapping("{id}")
    public ResponseEntity<PolicyDto> updatePolicy(@PathVariable("id") Long policyId,
                                                   @RequestBody PolicyDto policyDetails) {
        PolicyDto updatePolicy = policyService.updatePolicy(policyId, policyDetails);
        return ResponseEntity.ok(updatePolicy);
    }

    
   
}