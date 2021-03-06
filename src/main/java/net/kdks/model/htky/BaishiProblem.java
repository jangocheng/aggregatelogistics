package net.kdks.model.htky;

import java.util.List;

/**
 * 问题件.
 * 
 * @author Ze.Wang
 * @since 0.0.1
 */
public class BaishiProblem {
	/**
	 * 问题信息
	 */
	private List<BaishiProblemItems> problem;
	/**
	 * 运单号
	 */
	private String mailNo;
	public List<BaishiProblemItems> getProblem() {
		return problem;
	}
	public void setProblem(List<BaishiProblemItems> problem) {
		this.problem = problem;
	}
	public String getMailNo() {
		return mailNo;
	}
	public void setMailNo(String mailNo) {
		this.mailNo = mailNo;
	}
	@Override
	public String toString() {
		return "BaishiProblem [problem=" + problem + ", mailNo=" + mailNo + "]";
	}
	
	
}
