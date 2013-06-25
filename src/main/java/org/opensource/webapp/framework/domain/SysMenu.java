package org.opensource.webapp.framework.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity(name="SysMenu")
public class SysMenu extends BasicDomain{

	private SysMenu parent;
	private String levelCode;
	private String text;
	private String url;
	private String iconCls;
	private int order;
	
	//直接拥有该菜单的用户
	@ManyToMany(mappedBy="sysMenuSet",cascade=CascadeType.REMOVE)
	private Set<SysUser> sysUserSet;
	
	//直接拥有该菜单的角色
	@ManyToMany(mappedBy="sysMenuSet",cascade=CascadeType.REMOVE)
	private Set<SysRole> sysRoleSet;

	public SysMenu getParent() {
		return parent;
	}

	public void setParent(SysMenu parent) {
		this.parent = parent;
	}

	public String getLevelCode() {
		return levelCode;
	}

	public void setLevelCode(String levelCode) {
		this.levelCode = levelCode;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getIconCls() {
		return iconCls;
	}

	public void setIconCls(String iconCls) {
		this.iconCls = iconCls;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public Set<SysUser> getSysUserSet() {
		return sysUserSet;
	}

	public void setSysUserSet(Set<SysUser> sysUserSet) {
		this.sysUserSet = sysUserSet;
	}

	public Set<SysRole> getSysRoleSet() {
		return sysRoleSet;
	}

	public void setSysRoleSet(Set<SysRole> sysRoleSet) {
		this.sysRoleSet = sysRoleSet;
	}
	
	
}