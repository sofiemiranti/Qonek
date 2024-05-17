Feature: Chat Template - Create New Template

  Scenario: User menekan button Create New Template
    Given User sudah login
    When User berada di halaman Chat Template
    And User belum pernah membuat Chat Template sebelumnya dan terdapat button “Create New Template”
    When User menekan button “Create New Template”
    Then Menampilkan pop-up Create New Chat Template
    And Terbagi menjadi dua bagian, yaitu bagian “Editorial Template” dan bagian “Preview Template”
    And Pada bagian “Editorial Template” terdapat input form “Template Name” dan button “Load Existing” Box bubble chat satu button “Add Bubble Chat” dan button “Wait For Second” Input form “Template Hotkey”
    And Pada bagian “Preview Template” akan menampilkan contoh pesan seperti pada Bubble chat yang telah ditambahkan
    And Pada kanan bawah pop-up terdapat button “Save Template”

  Scenario: User memberi nama template
    Given User sudah login
    When User berada di halaman Chat Template
    And User belum pernah membuat Chat Template sebelumnya dan terdapat button “Create New Template”
    When User menekan button “Create New Template”
    Then Menampilkan pop-up Create New Chat Template
    When User klik dan mengetikkan "Promo Produk" pada form Template Name
    Then Input form Template Name akan aktif dan terisi "Promo Produk"

  Scenario: User membuat pesan pada bubble chat 1
    Given User sudah login
    When User berada di halaman Chat Template
    And User belum pernah membuat Chat Template sebelumnya dan terdapat button “Create New Template”
    When User menekan button “Create New Template”
    Then Menampilkan pop-up Create New Chat Template
    When User klik dan mengetikkan "Promo produk terbaru tahun ini" pada form box Bubble Chat Satu
    Then Box bubble chat satu akan terisi pesan "Promo produk terbaru tahun ini"
    And Pada bagian Preview menampilkan bubble chat dengan pesan "Promo produk terbaru tahun ini"

  Scenario: User menambahkan bubble chat baru
    Given User sudah login
    When User berada di halaman Chat Template
    And User belum pernah membuat Chat Template sebelumnya dan terdapat button “Create New Template”
    When User menekan button “Create New Template”
    Then Menampilkan pop-up Create New Chat Template
    When User klik button Add Bubble Chat
    Then Akan muncul bubble chat baru pada bagian Editorial Template






