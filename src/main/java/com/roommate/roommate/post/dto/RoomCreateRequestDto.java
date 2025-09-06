package com.roommate.roommate.post.dto;

import com.roommate.roommate.post.entity.HouseType;
import com.roommate.roommate.post.entity.MoveInDate;
import com.roommate.roommate.post.entity.RoomNum;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;

@Getter
@Schema(description = "방 모집글 생성 요청 데이터")
public class RoomCreateRequestDto {
    
    @Schema(description = "제목", example = "강남구 원룸 방 구해요")
    private String title;
    
    @Schema(description = "위도", example = "37.5665")
    private Double latitude;
    
    @Schema(description = "경도", example = "126.9780")
    private Double longitude;
    
    @Schema(description = "보증금 (만원)", example = "1000")
    private Integer deposit;
    
    @Schema(description = "월세 (만원)", example = "50")
    private Integer monthlyRent;
    
    @Schema(description = "관리비 (만원)", example = "5")
    private Integer managementFee;
    
    @Schema(description = "주거 형태", example = "APARTMENT")
    private HouseType houseType;

    @Schema(description = "방 개수", example = "ONE_ROOM")
    private RoomNum roomNum;
    
    @Schema(description = "방 크기 (평방미터)", example = "25.5")
    private Double size;
    
    @Schema(description = "입주 가능일", example = "Q1")
    private MoveInDate moveInDate;
    
    @Schema(description = "최소 거주 기간 (개월)", example = "6")
    private Integer minStayPeriod;
    
    @Schema(description = "내용", example = "강남구 역삼동 원룸에서 룸메이트를 구합니다.")
    private String content;
    
    @Schema(description = "지역 (자동 설정됨)", example = "강남구 역삼동")
    private String area;
}
