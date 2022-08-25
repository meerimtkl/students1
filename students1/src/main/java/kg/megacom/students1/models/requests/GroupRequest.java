package kg.megacom.students1.models.requests;

import com.fasterxml.jackson.annotation.JsonFormat;
import kg.megacom.students1.models.enums.Day;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.List;
@Data
@FieldDefaults(level= AccessLevel.PRIVATE)
public class GroupRequest {



    String groupTitle;
    Long courseId;
    @JsonFormat(pattern = "dd.MM.yyyy")
    Date startDate;
    List<Day>days;

}
