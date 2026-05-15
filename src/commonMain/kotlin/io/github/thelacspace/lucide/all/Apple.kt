package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Apple") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12f, 6.528f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.237f, 21f)
                arcTo(15f, 15f, 0f, false, false, 22f, 11f)
                arcToRelative(6f, 6f, 0f, false, false, -10f, -4.472f)
                arcTo(6f, 6f, 0f, false, false, 2f, 11f)
                arcToRelative(15.1f, 15.1f, 0f, false, false, 3.763f, 10f)
                arcToRelative(3f, 3f, 0f, false, false, 3.648f, .648f)
                arcToRelative(5.5f, 5.5f, 0f, false, true, 5.178f, 0f)
                arcTo(3f, 3f, 0f, false, false, 18.237f, 21f)
            }
}

public val LucideIcons.All.AppleDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Apple: ImageVector
    @Composable get() = AppleDefinition.asImageVector()
