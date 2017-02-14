package com.niit.careersite.DAO;

import java.util.List;

import com.niit.careersite.model.BlogLikes;

public interface BlogLikesDAO {

	public boolean saveOrUpdate(BlogLikes blogLikes);

	public boolean delete(BlogLikes blogLikes);

	public BlogLikes list(int uid, int bid);

	public List<BlogLikes> bloglist(int bid);
}
