package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Ampersand") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16f, 12f)
                horizontalLineToRelative(3f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.5f, 12f)
                arcToRelative(8f, 8f, 0f, false, true, -8f, 8f)
                arcTo(4.5f, 4.5f, 0f, false, true, 5f, 15.5f)
                curveToRelative(0f, -6f, 8f, -4f, 8f, -8.5f)
                arcToRelative(3f, 3f, 0f, true, false, -6f, 0f)
                curveToRelative(0f, 3f, 2.5f, 8.5f, 12f, 13f)
            }
}

public val LucideIcons.All.AmpersandDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Ampersand: ImageVector
    @Composable get() = AmpersandDefinition.asImageVector()
