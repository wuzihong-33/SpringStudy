package mapper;

import com.service.ClassInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


public interface ClassesMapper {
    @Select("SELECT * FROM classes WHERE class_id = #{id}")
    ClassInfo getClassInfo(@Param("id") int id);

    @Insert("INSERT INTO classes (class_id,name) VALUES(#{classinfo.class_id},#{classinfo.name})")
    boolean insert(@Param("classinfo") ClassInfo classInfo);

}
