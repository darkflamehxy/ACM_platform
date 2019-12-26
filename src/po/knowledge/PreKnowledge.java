package po.knowledge;

public class PreKnowledge {
    private Integer id;  /* 主键，无意义 */
    private Knowledge knowledge;
    private Knowledge preKnow;

    public PreKnowledge() {
    }

    public PreKnowledge(Integer id, Knowledge knowledge, Knowledge preKnow) {
        this.id = id;
        this.knowledge = knowledge;
        this.preKnow = preKnow;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Knowledge getKnowledge() {
        return knowledge;
    }

    public void setKnowledge(Knowledge knowledge) {
        this.knowledge = knowledge;
    }

    public Knowledge getPreKnow() {
        return preKnow;
    }

    public void setPreKnow(Knowledge preKnow) {
        this.preKnow = preKnow;
    }

    @Override
    public String toString() {
        return "PreKnowledge{" +
                "id=" + id +
                ", knowledge=" + knowledge.getId() +
                ", preKnow=" + preKnow.getId() +
                '}';
    }
}
