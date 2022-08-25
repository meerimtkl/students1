package kg.megacom.students1.mappers;


import kg.megacom.students1.models.Student;
import kg.megacom.students1.models.dto.StudentDto;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Objects;
import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor

public class StudentMapper {
    private final ModelMapper modelMapper;
        public Student toEntity(StudentDto studentDto){
            return Objects.isNull(studentDto)?null:modelMapper.map(studentDto,Student.class);
        }
        public StudentDto toDto(Student student){
            return Objects.isNull(student)?null:modelMapper.map(student,StudentDto.class);

        }
        public List<StudentDto>toDtoList(List<Student> studentList){
          //  List<StudentDto> postDtoList = Arrays.asList(modelMapper.map(studentList, StudentDto[].class));

            //  return Objects.isNull(studentList)?null: Arrays.asList(modelMapper.map(studentList, StudentDto[].class));

       return studentList.stream().map(student->modelMapper.map(student,StudentDto.class))
               .collect(Collectors.toList());
        }


}
