package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("LineDotRightHorizontal") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3f, 12f)
                lineTo(15f, 12f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0f, 12.0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, 6.0f, 0f)
                arcToRelative(3.0f, 3.0f, 0f, true, false, -6.0f, 0f)
            }
}

public val LucideIcons.All.LineDotRightHorizontalDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.LineDotRightHorizontal: ImageVector
    @Composable get() = LineDotRightHorizontalDefinition.asImageVector()
