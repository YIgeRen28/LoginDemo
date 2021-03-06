package com.himan.content.service;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.himan.content.model.Comment;
import com.himan.content.model.Message;

public interface IMessageService {

	public List<Message> getHotList();

	public List<Message> getNewestList();

	public List<Message> getStarList();

	public List<Message> getFunnyList();
	
	public List<Message> getEmotionList();
	
	public List<Message> getMilitaryList();
	
	public List<Message> getSocialList();
	
	public List<Message> getFashionList();
	
	public List<Message> getSportsList();
	
	public List<Message> getCartoonList();

	public Message findByMessageId(String messageId);

	public Message addPraise(String messageId, String userId);

	public Message collect(String messageId, String userId);

	public List<Message> attention(String userId);

	public List<Message> article();

	public List<Message> singleImage();

	public List<Message> fourImage();

	public List<Message> fuzzySearch(String keyword);

	public List<Comment> findCommentByMessageId(String messageId);

	public List<Message> myCollect(String userId);

	public List<Message> myPraise(String userId);

	public Message getByMessageId(String messageId);
}
