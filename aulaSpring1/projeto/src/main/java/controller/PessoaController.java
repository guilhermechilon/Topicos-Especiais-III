import com.example.projeto.service.PessoaService;

public class PessoaController{
    private final service.PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService){
        this.pessoaService = pessoaService;
    }

    @GetMapping
    public List<Pessoa> listarPessoas(){
        return pessoaService.listarPessoas();
    }

    @GetMapping("/id")
    public ResponseEntity<Pessoa> buscarPessoa(@PathVariable Long id){
        return pessoaService.buscarPorId(id)
        .map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound().build());
    }

    public Pessoa criarPessoa(@PathVariable Pessoa pessoa){
        return pessoa.Service.salvarPessoa(pessoa);
    }

    public ResponseEntity<Void> deletarPessoa(@PathVariable Long id){
        pessoaService deletarPessoa(id);
        return ResponseEntity.noContet().build();
    }

}