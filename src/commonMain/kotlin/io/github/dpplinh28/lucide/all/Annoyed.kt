package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Annoyed") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0f, 12.0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, 20.0f, 0f)
                arcToRelative(10.0f, 10.0f, 0f, true, false, -20.0f, 0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 15f)
                horizontalLineToRelative(8f)
            }
            lucidePath(strokeWidth) {
                moveTo(8f, 9f)
                horizontalLineToRelative(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 9f)
                horizontalLineToRelative(2f)
            }
}

public val LucideIcons.All.AnnoyedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Annoyed: ImageVector
    @Composable get() = AnnoyedDefinition.asImageVector()
