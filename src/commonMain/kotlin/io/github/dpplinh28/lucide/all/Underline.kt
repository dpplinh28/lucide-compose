package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Underline") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6f, 4f)
                verticalLineToRelative(6f)
                arcToRelative(6f, 6f, 0f, false, false, 12f, 0f)
                verticalLineTo(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 20f)
                lineTo(20f, 20f)
            }
}

public val LucideIcons.All.UnderlineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Underline: ImageVector
    @Composable get() = UnderlineDefinition.asImageVector()
