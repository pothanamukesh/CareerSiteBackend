package com.niit.careersite.DAO;

import java.util.List;

import com.niit.careersite.model.ForumComment;

public interface ForumCommentDAO {
	public boolean saveOrUpdate(ForumComment forumcomment);

	public boolean delete(ForumComment forumcomment);

	public List<ForumComment> list(int fid);
}