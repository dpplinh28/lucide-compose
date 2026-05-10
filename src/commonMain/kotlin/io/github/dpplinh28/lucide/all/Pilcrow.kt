package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Pilcrow") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13f, 4f)
                verticalLineToRelative(16f)
            }
            lucidePath(strokeWidth) {
                moveTo(17f, 4f)
                verticalLineToRelative(16f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 4f)
                horizontalLineTo(9.5f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, 0f, 9f)
                horizontalLineTo(13f)
            }
}

public val LucideIcons.All.PilcrowDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Pilcrow: ImageVector
    @Composable get() = PilcrowDefinition.asImageVector()
