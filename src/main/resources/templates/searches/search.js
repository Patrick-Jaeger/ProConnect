// Beispiel-Kategorien
const categories = ['Kategorie 1', 'Kategorie 2', 'Kategorie 3', 'Kategorie 4', 'Kategorie 5'];

// Live-Suche
const categorySearchInput = document.getElementById('categorySearchInput');
const categoryResults = document.getElementById('categoryResults');

categorySearchInput.addEventListener('input', function() {
	console.log('Eingabe erkannt:', this.value);
	const searchQuery = this.value.toLowerCase();

	// Anfrage an den Server senden, um Kategorien abzurufen
	//fetch('/api/categories')
	// .then(response => response.json())
	// .then(categories => {
	const filteredCategories = categories.filter(category => category.toLowerCase().includes(searchQuery));

	// Anzeige der Ergebnisse
	categoryResults.innerHTML = '';
	filteredCategories.forEach(category => {
		const resultItem = document.createElement('a');
		resultItem.classList.add('dropdown-item');
		resultItem.href = '#';
		resultItem.textContent = category;
		resultItem.addEventListener('click', function() {
			// Aktion ausführen, wenn eine Kategorie ausgewählt wird
			alert('Kategorie ausgewählt: ' + category);
		});
		categoryResults.appendChild(resultItem);
	});
	//})
	//    .catch(error => console.error('Fehler beim Abrufen der Kategorien:', error));
});

// Holen Sie sich das Range-Element
const rangeInput = document.getElementById('customRange');
// Holen Sie sich das Anzeigeelement für die Position
const positionDisplay = document.getElementById('currentPosition');

// Fügen Sie einen Event Listener für den "input"-Event hinzu
rangeInput.addEventListener('input', function() {
	// Aktualisieren Sie die angezeigte Position während des Verschiebens
	positionDisplay.textContent = this.value;
});