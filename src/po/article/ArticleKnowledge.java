package po.article;

import po.knowledge.Knowledge;

public class ArticleKnowledge {
    private Integer id;

    private Article article;
    private Knowledge knowledge;

    public ArticleKnowledge() {
    }

    public ArticleKnowledge(Integer id, Knowledge knowledge, Article article) {
        this.id = id;
        this.knowledge = knowledge;
        this.article = article;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public Knowledge getKnowledge() {
        return knowledge;
    }

    public void setKnowledge(Knowledge knowledge) {
        this.knowledge = knowledge;
    }

    @Override
    public String toString() {
        return "ArticleKnowledge{" +
                "id=" + id +
                //", article=" + article +
                //", knowledge=" + knowledge +
                '}';
    }
}
