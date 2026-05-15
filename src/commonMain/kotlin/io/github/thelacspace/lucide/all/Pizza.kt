package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Pizza") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(12f, 14f)
                lineToRelative(-1f, 1f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(13.75f, 18.25f)
                lineToRelative(-1.25f, 1.42f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.775f, 5.654f)
                arcToRelative(15.68f, 15.68f, 0f, false, false, -12.121f, 12.12f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.8f, 9.3f)
                arcToRelative(1f, 1f, 0f, false, false, 2.1f, 7.7f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.964f, 20.732f)
                arcToRelative(1f, 1f, 0f, false, true, -1.232f, 1.232f)
                lineToRelative(-18f, -5f)
                arcToRelative(1f, 1f, 0f, false, true, -.695f, -1.232f)
                arcTo(19.68f, 19.68f, 0f, false, true, 15.732f, 2.037f)
                arcToRelative(1f, 1f, 0f, false, true, 1.232f, .695f)
                close()
            }
}

public val LucideIcons.All.PizzaDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Pizza: ImageVector
    @Composable get() = PizzaDefinition.asImageVector()
