
const Curriculum = () => {

    
    const data = {
        nome: "Guilhermo",
        idade: 15,
        profissao: "None",
        habilidades: ["Jogar Futebol"],


    }

// função para regra de negócio

const verificarIdade = (idade) => {
    return idade >= 18 ? "Maior de idade" : "Menor de idade"
}

    return (
        <div className="card">
                <h2>{data.nome}</h2>   
                <span className="badge">{data.profissao}</span>
                <p>Idade: {data.idade}</p>
                <p>{verificarIdade(data.idade)}</p>
            <div className="section">
                <h3>Habilidades</h3>
                <ul>
                    {data.habilidades.map((h, index) => () )}
                </ul>

                </div>
                <div className="section">
                    <h3>Experiência</h3>
                </div>

            </div>
    )
}

export default Curriculum