package com.mvs;


import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

/**
 * Created by quangminh on 19/04/2017.
 */
@Component
public class DatabaseLoader {
    /*  private final AuthorRepository authorRepository;
      private final ArticleRepository articleRepository;

      @Autowired
      public DatabaseLoader(AuthorRepository authorRepository, ArticleRepository articleRepository) {
          this.authorRepository = authorRepository;
          this.articleRepository = articleRepository;
      }*/


    @Transactional
    public void run(String... string) {


    }

}
