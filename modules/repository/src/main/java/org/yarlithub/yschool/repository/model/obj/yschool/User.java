package org.yarlithub.yschool.repository.model.obj.yschool;

import com.felees.hbnpojogen.persistence.IPojoGenEntity;
import java.io.Serializable;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.hibernate.proxy.HibernateProxy;
import org.yarlithub.yschool.repository.model.obj.yschool.iface.IUser;


/** 
 * Object mapping for hibernate-handled table: user.
 * @author autogenerated
 */

@Entity
@Table(name = "user", schema = "yschool")
public class User implements Cloneable, Serializable, IPojoGenEntity, IUser {

	/** Serial Version UID. */
	private static final long serialVersionUID = -558977413L;

	/** Use a WeakHashMap so entries will be garbage collected once all entities 
		referring to a saved hash are garbage collected themselves. */
	private static final Map<Serializable, Integer> SAVED_HASHES =
		Collections.synchronizedMap(new WeakHashMap<Serializable, Integer>());
	
	/** hashCode temporary storage. */
	private volatile Integer hashCode;
	

	/** Field mapping. */
	private String email;
	/** Field mapping. */
	private Integer id = 0; // init for hibernate bug workaround
	/** Field mapping. */
	private String password;
	/** Field mapping. */
	private String userName;
	/** Field mapping. */
	private UserRole userRoleIduserRole;
	/**
	 * Default constructor, mainly for hibernate use.
	 */
	public User() {
		// Default constructor
	} 

	/** Constructor taking a given ID.
	 * @param id to set
	 */
	public User(Integer id) {
		this.id = id;
	}
	
	/** Constructor taking a given ID.
	 * @param id Integer object;
	 * @param password String object;
	 * @param userName String object;
	 * @param userRoleIduserRole UserRole object;
	 */
	public User(Integer id, String password, String userName, 					
			UserRole userRoleIduserRole) {

		this.id = id;
		this.password = password;
		this.userName = userName;
		this.userRoleIduserRole = userRoleIduserRole;
	}
	
 


 
	/** Return the type of this class. Useful for when dealing with proxies.
	* @return Defining class.
	*/
	@Transient
	public Class<?> getClassType() {
		return User.class;
	}
 

    /**
     * Return the value associated with the column: email.
	 * @return A String object (this.email)
	 */
	@Basic( optional = true )
	@Column( length = 45  )
	public String getEmail() {
		return this.email;
		
	}
	

  
    /**  
     * Set the value related to the column: email.
	 * @param email the email value you wish to set
	 */
	public void setEmail(final String email) {
		this.email = email;
	}

    /**
     * Return the value associated with the column: id.
	 * @return A Integer object (this.id)
	 */
    @Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Basic( optional = false )
	@Column( name = "iduser", nullable = false  )
	public Integer getId() {
		return this.id;
		
	}
	

  
    /**  
     * Set the value related to the column: id.
	 * @param id the id value you wish to set
	 */
	public void setId(final Integer id) {
		// If we've just been persisted and hashCode has been
		// returned then make sure other entities with this
		// ID return the already returned hash code
		if ( (this.id == null || this.id == 0) &&
				(id != null) &&
				(this.hashCode != null) ) {
		SAVED_HASHES.put( id, this.hashCode );
		}
		this.id = id;
	}

    /**
     * Return the value associated with the column: password.
	 * @return A String object (this.password)
	 */
	@Basic( optional = false )
	@Column( nullable = false, length = 45  )
	public String getPassword() {
		return this.password;
		
	}
	

  
    /**  
     * Set the value related to the column: password.
	 * @param password the password value you wish to set
	 */
	public void setPassword(final String password) {
		this.password = password;
	}

    /**
     * Return the value associated with the column: userName.
	 * @return A String object (this.userName)
	 */
	@Basic( optional = false )
	@Column( name = "user_name", nullable = false, length = 45  )
	public String getUserName() {
		return this.userName;
		
	}
	

  
    /**  
     * Set the value related to the column: userName.
	 * @param userName the userName value you wish to set
	 */
	public void setUserName(final String userName) {
		this.userName = userName;
	}

    /**
     * Return the value associated with the column: userRoleIduserRole.
	 * @return A UserRole object (this.userRoleIduserRole)
	 */
	@ManyToOne( cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.LAZY )
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE})
	@Basic( optional = false )
	@JoinColumn(name = "user_role_iduser_role", nullable = false )
	public UserRole getUserRoleIduserRole() {
		return this.userRoleIduserRole;
		
	}
	

  
    /**  
     * Set the value related to the column: userRoleIduserRole.
	 * @param userRoleIduserRole the userRoleIduserRole value you wish to set
	 */
	public void setUserRoleIduserRole(final UserRole userRoleIduserRole) {
		this.userRoleIduserRole = userRoleIduserRole;
	}


   /**
    * Deep copy.
	* @return cloned object
	* @throws CloneNotSupportedException on error
    */
    @Override
    public User clone() throws CloneNotSupportedException {
		
        final User copy = (User)super.clone();

		copy.setEmail(this.getEmail());
		copy.setId(this.getId());
		copy.setPassword(this.getPassword());
		copy.setUserName(this.getUserName());
		copy.setUserRoleIduserRole(this.getUserRoleIduserRole());
		return copy;
	}
	


	/** Provides toString implementation.
	 * @see java.lang.Object#toString()
	 * @return String representation of this class.
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("email: " + this.getEmail() + ", ");
		sb.append("id: " + this.getId() + ", ");
		sb.append("password: " + this.getPassword() + ", ");
		sb.append("userName: " + this.getUserName() + ", ");
		return sb.toString();		
	}


	/** Equals implementation. 
	 * @see java.lang.Object#equals(java.lang.Object)
	 * @param aThat Object to compare with
	 * @return true/false
	 */
	@Override
	public boolean equals(final Object aThat) {
		Object proxyThat = aThat;
		
		if ( this == aThat ) {
			 return true;
		}

		
		if (aThat instanceof HibernateProxy) {
 			// narrow down the proxy to the class we are dealing with.
 			try {
				proxyThat = ((HibernateProxy) aThat).getHibernateLazyInitializer().getImplementation(); 
			} catch (org.hibernate.ObjectNotFoundException e) {
				return false;
		   	}
		}
		if (aThat == null)  {
			 return false;
		}
		
		final User that; 
		try {
			that = (User) proxyThat;
			if ( !(that.getClassType().equals(this.getClassType()))){
				return false;
			}
		} catch (org.hibernate.ObjectNotFoundException e) {
				return false;
		} catch (ClassCastException e) {
				return false;
		}
		
		
		boolean result = true;
		result = result && (((this.getId() == null) && ( that.getId() == null)) || (this.getId() != null  && this.getId().equals(that.getId())));
		result = result && (((getEmail() == null) && (that.getEmail() == null)) || (getEmail() != null && getEmail().equals(that.getEmail())));
		result = result && (((getPassword() == null) && (that.getPassword() == null)) || (getPassword() != null && getPassword().equals(that.getPassword())));
		result = result && (((getUserName() == null) && (that.getUserName() == null)) || (getUserName() != null && getUserName().equals(that.getUserName())));
		result = result && (((getUserRoleIduserRole() == null) && (that.getUserRoleIduserRole() == null)) || (getUserRoleIduserRole() != null && getUserRoleIduserRole().getId().equals(that.getUserRoleIduserRole().getId())));	
		return result;
	}
	
	/** Calculate the hashcode.
	 * @see java.lang.Object#hashCode()
	 * @return a calculated number
	 */
	@Override
	public int hashCode() {
		if ( this.hashCode == null ) {
			synchronized ( this ) {
				if ( this.hashCode == null ) {
					Integer newHashCode = null;

					if ( getId() != null ) {
					newHashCode = SAVED_HASHES.get( getId() );
					}
					
					if ( newHashCode == null ) {
						if ( getId() != null && getId() != 0) {
							newHashCode = getId();
						} else {

						}
					}
					
					this.hashCode = newHashCode;
				}
			}
		}
	return this.hashCode;
	}
	

	
}
