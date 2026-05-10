package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CornerRightUp") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(10f, 9f)
                lineToRelative(5f, -5f)
                lineToRelative(5f, 5f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 20f)
                horizontalLineToRelative(7f)
                arcToRelative(4f, 4f, 0f, false, false, 4f, -4f)
                verticalLineTo(4f)
            }
}

public val LucideIcons.All.CornerRightUpDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CornerRightUp: ImageVector
    @Composable get() = CornerRightUpDefinition.asImageVector()
