package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("SkipForward") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21f, 4f)
                verticalLineToRelative(16f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.029f, 4.285f)
                arcTo(2f, 2f, 0f, false, false, 3f, 6f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 3.029f, 1.715f)
                lineToRelative(9.997f, -5.998f)
                arcToRelative(2f, 2f, 0f, false, false, .003f, -3.432f)
                close()
            }
}

public val LucideIcons.All.SkipForwardDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.SkipForward: ImageVector
    @Composable get() = SkipForwardDefinition.asImageVector()
