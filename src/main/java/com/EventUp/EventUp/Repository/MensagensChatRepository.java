package com.EventUp.EventUp.Repository;

import com.EventUp.EventUp.Model.MensagensChat;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MensagensChatRepository extends CrudRepository<MensagensChat,Integer> {
}