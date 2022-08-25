package kg.megacom.students1.repositories;

import kg.megacom.students1.models.Group;
import kg.megacom.students1.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface TeacherRepo extends JpaRepository<Teacher,Long> {
    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(value="update teachers set title=?2 where id=?1",nativeQuery = true)
    void update(@Param("id")Long id,@Param("title")String title);



}

