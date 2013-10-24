package org.yarlithub.yschool.repository.model.obj.yschool.iface;
import org.yarlithub.yschool.repository.model.obj.yschool.ClassroomSubject;
import org.yarlithub.yschool.repository.model.obj.yschool.StaffHasRole;


/** 
 * Object interface mapping for hibernate-handled table: classroom_subject_has_staff_has_role.
 * @author autogenerated
 */

public interface IClassroomSubjectHasStaffHasRolePK {



    /**
     * Return the value associated with the column: classroomSubjectIdclassroomSubject.
	 * @return A ClassroomSubject object (this.classroomSubjectIdclassroomSubject)
	 */
	ClassroomSubject getClassroomSubjectIdclassroomSubject();
	

  
    /**  
     * Set the value related to the column: classroomSubjectIdclassroomSubject.
	 * @param classroomSubjectIdclassroomSubject the classroomSubjectIdclassroomSubject value you wish to set
	 */
	void setClassroomSubjectIdclassroomSubject(final ClassroomSubject classroomSubjectIdclassroomSubject);

    /**
     * Return the value associated with the column: staffHasRoleIdstaffHasRole.
	 * @return A StaffHasRole object (this.staffHasRoleIdstaffHasRole)
	 */
	StaffHasRole getStaffHasRoleIdstaffHasRole();
	

  
    /**  
     * Set the value related to the column: staffHasRoleIdstaffHasRole.
	 * @param staffHasRoleIdstaffHasRole the staffHasRoleIdstaffHasRole value you wish to set
	 */
	void setStaffHasRoleIdstaffHasRole(final StaffHasRole staffHasRoleIdstaffHasRole);

	// end of interface
}