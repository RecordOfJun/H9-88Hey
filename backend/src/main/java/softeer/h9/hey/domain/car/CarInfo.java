package softeer.h9.hey.domain.car;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CarInfo {
    private String carCode;
    private int trimId;
    private int engineId;
    private int bodyTypeId;
    private int wheelDriveId;
}
