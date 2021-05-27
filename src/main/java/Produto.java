
public class Produto {

	private int id;
	private String nome;
	private int unidadeCompra;
	private String descricao;
	private float qtdPrevistoMes;
	private float precoMaxComprado;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getUnidadeCompra() {
		return unidadeCompra;
	}

	public void setUnidadeCompra(int unidadeCompra) {
		this.unidadeCompra = unidadeCompra;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getQtdPrevistoMes() {
		return qtdPrevistoMes;
	}

	public void setQtdPrevistoMes(float qtdPrevistoMes) {
		this.qtdPrevistoMes = qtdPrevistoMes;
	}

	public float getPrecoMaxComprado() {
		return precoMaxComprado;
	}

	public void setPrecoMaxComprado(float precoMaxComprado) {
		this.precoMaxComprado = precoMaxComprado;
	}

	@Override
    public String toString() {
		return "Produto [id=" + id + ", unidadeCompra=" + unidadeCompra + ", descricao=" + descricao + ", qtdPrevistoMes=" + qtdPrevistoMes + ", precoMaxComprado" + precoMaxComprado + "]";
    }
}
