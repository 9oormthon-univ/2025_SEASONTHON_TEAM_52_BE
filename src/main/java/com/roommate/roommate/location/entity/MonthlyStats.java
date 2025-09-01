package com.roommate.roommate.location.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "monthly_stats")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MonthlyStats {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "region_code", length = 5)
    private String regionCode;
    
    @Column(name = "region_name", length = 20)
    private String regionName;
    
    @Column(name = "collect_month", length = 6)
    private String collectMonth;
    
    @Column(name = "total_contracts")
    private Integer totalContracts;
    
    @Column(name = "youth_contracts")
    private Integer youthContracts;
    
    @Column(name = "youth_median_monthly_rent")
    private Integer youthMedianMonthlyRent;
    
    @Column(name = "youth_avg_monthly_rent")
    private Integer youthAvgMonthlyRent;
    
    @Column(name = "area_20_25_count")
    private Integer area2025Count;
    
    @Column(name = "area_20_25_median")
    private Integer area2025Median;
    
    @Column(name = "area_20_25_avg")
    private Integer area2025Avg;
    
    @Column(name = "area_25_30_count")
    private Integer area2530Count;
    
    @Column(name = "area_25_30_median")
    private Integer area2530Median;
    
    @Column(name = "area_25_30_avg")
    private Integer area2530Avg;
    
    @Column(name = "area_30_35_count")
    private Integer area3035Count;
    
    @Column(name = "area_30_35_median")
    private Integer area3035Median;
    
    @Column(name = "area_30_35_avg")
    private Integer area3035Avg;
    
    @Column(name = "area_35_40_count")
    private Integer area3540Count;
    
    @Column(name = "area_35_40_median")
    private Integer area3540Median;
    
    @Column(name = "area_35_40_avg")
    private Integer area3540Avg;
}
