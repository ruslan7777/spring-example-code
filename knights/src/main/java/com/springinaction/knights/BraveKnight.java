package com.springinaction.knights;

import org.springframework.context.annotation.Bean;

public class BraveKnight implements Knight {
  private Quest quest;
  
  public BraveKnight(Quest quest) {
    this.quest = quest;       //<co id="co_injectedQuest"/>
  }
  
  public void embarkOnQuest() throws QuestException {
    quest.embark();
  }

  public BraveKnight() {
  }

  public void setQuest(Quest quest) {
    this.quest = quest;
  }
}
