package com.example.hostelmanagementsystem.entity;

import com.example.hostelmanagementsystem.dto.RoleDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.math.BigDecimal;
import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class ProspectiveStudent implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String nameWithInitials;
    private String nationalId;
    private String gender;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false,unique = true)
    private String password;

    private RoleDto userRole;

    @Column(nullable = false,unique = true)
    private String studentId;

    private Integer contactNumber;
    private String street;
    private String village;
    private String district;
    private String province;
    private Integer postalCode;
    private BigDecimal distanceToHome;
    private String mainIncome;
    private String additionalIncome;
    private Integer numberFamilyMembers;
    private Integer numberOfSiblings;
    private Integer numberOfSiblingsEdu;
    private String nameOfGuardian;
    private String guardianContactNumber;
    private String status;
    private String facultyName;
    private BigDecimal annualSalary;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getUsername() {
        return getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
