package prg1.lx01.hello5

/*
 * 関数を宣言し、利用する例。
 * この例はhelloという名前の関数を宣言しています。
 * main関数のなかでhelloは二回呼ばれます。
 */

def hello(role: String, professor: String): Unit = {
  println(role + "担当は" + professor + "です。")
}

@main
def main = {
  hello("講義", "脇田 建（わきた けん）")
  hello("演習", "七島 幹人（ななしま みきと）")
}
