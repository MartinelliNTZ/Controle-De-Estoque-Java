# Controle-De-Estoque-Java
 - TRabalho de Java
 
                try{User usuarioSelect = listaUsers.get(i);
                    AlertDialog.Builder aler =new AlertDialog.Builder(MainActivity.this);
                    aler.setMessage("Deseja excluir a tarefa: "+usuarioSelect.getNome()+" ?");
                    aler.setTitle("Excluir itens.");
                    aler.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            String[] args= {usuarioSelect.getId().toString()};
                            dados.delete("pessoas","id=?",args);
                            Toast.makeText(MainActivity.this, "Deletado.", Toast.LENGTH_SHORT).show();
                            listarDados();
                        }
                    });
                    aler.setNegativeButton("Não", null);
                    aler.setIcon(R.drawable.ic_delete);
                    aler.create();
                    aler.show();

                }catch (Exception e){
                    Log.i("INFO","Erro: "+e.getMessage());
                }
                return false;
            }
