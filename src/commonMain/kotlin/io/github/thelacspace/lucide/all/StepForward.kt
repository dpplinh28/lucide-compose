package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("StepForward") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.029f, 4.285f)
                arcTo(2f, 2f, 0f, false, false, 7f, 6f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 3.029f, 1.715f)
                lineToRelative(9.997f, -5.998f)
                arcToRelative(2f, 2f, 0f, false, false, .003f, -3.432f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 4f)
                verticalLineToRelative(16f)
            }
}

public val LucideIcons.All.StepForwardDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.StepForward: ImageVector
    @Composable get() = StepForwardDefinition.asImageVector()
