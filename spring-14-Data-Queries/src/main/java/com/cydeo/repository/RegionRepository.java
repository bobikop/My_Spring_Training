package com.cydeo.repository;

import com.cydeo.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegionRepository extends JpaRepository<Region,Long> {

    //Display all regions in Canada

    List<Region> findByCountry(String country);  // we created method here
    // or we can write the same code on fallowing way
    List<Region> getByCountry (String country);

    // Display all regions with country name includes 'United'

    List<Region>  findByCountryContaining(String country);
    //Display all regions with country name includes 'United' in order(region)
    List<Region> findByCountryContainsOrderByRegion(String country);

    //Display all regions with country name included "United in order(region)
    List<Region> findByCountryContainsOrderByRegionDesc(String country);

    //Display top 2 regions in United States
    List<Region> findTopByCountry(String country);
    List<Region> findTop2ByCountry(String country);

    List<Region> findTopByCountryContainsOrderByRegion(String country);

}
