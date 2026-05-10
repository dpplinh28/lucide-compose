package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Library") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(16f, 6f)
                lineToRelative(4f, 14f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 6f)
                verticalLineToRelative(14f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 8f)
                verticalLineToRelative(12f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 4f)
                verticalLineToRelative(16f)
            }
}

public val LucideIcons.All.LibraryDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Library: ImageVector
    @Composable get() = LibraryDefinition.asImageVector()
