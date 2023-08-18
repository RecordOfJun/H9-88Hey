package softeer.h9.hey.dto.myChiving;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

import lombok.Getter;
import lombok.Setter;
import softeer.h9.hey.domain.myChiving.MyChiving;
import softeer.h9.hey.dto.myChiving.request.MyChivingSaveRequest;
import softeer.h9.hey.dto.myChiving.request.MyChivingTempSaveRequest;

@Setter
@Getter
public class MyChivingSaveDto {
	private Long id;
	private int userId;
	private int interiorColorId;
	private int exteriorColorId;
	private int bodyTypeId;
	private int wheelTypeId;
	private int trimId;
	private int engineId;
	private List<String> selectOptionIdList;
	private boolean isSubmitted;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		MyChivingSaveDto that = (MyChivingSaveDto) o;
		return userId == that.userId &&
			interiorColorId == that.interiorColorId &&
			exteriorColorId == that.exteriorColorId &&
			bodyTypeId == that.bodyTypeId &&
			wheelTypeId == that.wheelTypeId &&
			trimId == that.trimId &&
			engineId == that.engineId &&
			Objects.equals(id, that.id) &&
			Objects.equals(selectOptionIdList, that.selectOptionIdList);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, userId, interiorColorId, exteriorColorId, bodyTypeId,
			wheelTypeId, trimId, engineId, selectOptionIdList);
	}

	public static MyChivingSaveDto fromMyChivingSaveRequest(MyChivingSaveRequest myChivingSaveRequest) {
		MyChivingSaveDto myChivingSaveDto = new MyChivingSaveDto();
		myChivingSaveDto.setId(myChivingSaveRequest.getId());
		myChivingSaveDto.setEngineId(myChivingSaveRequest.getEngineId());
		myChivingSaveDto.setBodyTypeId(myChivingSaveRequest.getBodyTypeId());
		myChivingSaveDto.setTrimId(myChivingSaveRequest.getTrimId());
		myChivingSaveDto.setWheelTypeId(myChivingSaveRequest.getWheelTypeId());
		myChivingSaveDto.setExteriorColorId(myChivingSaveRequest.getExteriorColorId());
		myChivingSaveDto.setInteriorColorId(myChivingSaveRequest.getInteriorColorId());
		myChivingSaveDto.setSelectOptionIdList(myChivingSaveRequest.getSelectOptionIdList());
		return myChivingSaveDto;
	}

	public static MyChivingSaveDto fromMyChivingTempSaveRequest(MyChivingTempSaveRequest myChivingTempSaveRequest) {
		MyChivingSaveDto myChivingSaveDto = new MyChivingSaveDto();
		myChivingSaveDto.setId(myChivingTempSaveRequest.getId());
		myChivingSaveDto.setEngineId(myChivingTempSaveRequest.getEngineId());
		myChivingSaveDto.setBodyTypeId(myChivingTempSaveRequest.getBodyTypeId());
		myChivingSaveDto.setTrimId(myChivingTempSaveRequest.getTrimId());
		myChivingSaveDto.setWheelTypeId(myChivingTempSaveRequest.getWheelTypeId());
		myChivingSaveDto.setExteriorColorId(myChivingTempSaveRequest.getExteriorColorId());
		myChivingSaveDto.setInteriorColorId(myChivingTempSaveRequest.getInteriorColorId());
		myChivingSaveDto.setSelectOptionIdList(myChivingTempSaveRequest.getSelectOptionIdList());
		return myChivingSaveDto;
	}
}
