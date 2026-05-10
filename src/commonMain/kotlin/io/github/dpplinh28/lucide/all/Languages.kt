package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Languages") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(5f, 8f)
                lineToRelative(6f, 6f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(4f, 14f)
                lineToRelative(6f, -6f)
                lineToRelative(2f, -3f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 5f)
                horizontalLineToRelative(12f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 2f)
                horizontalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(22f, 22f)
                lineToRelative(-5f, -10f)
                lineToRelative(-5f, 10f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 18f)
                horizontalLineToRelative(6f)
            }
}

public val LucideIcons.All.LanguagesDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Languages: ImageVector
    @Composable get() = LanguagesDefinition.asImageVector()
