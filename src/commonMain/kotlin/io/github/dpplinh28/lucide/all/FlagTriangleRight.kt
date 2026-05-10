package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FlagTriangleRight") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6f, 22f)
                verticalLineTo(2.8f)
                arcToRelative(.8f, .8f, 0f, false, true, 1.17f, -.71f)
                lineToRelative(11.38f, 5.69f)
                arcToRelative(.8f, .8f, 0f, false, true, 0f, 1.44f)
                lineTo(6f, 15.5f)
            }
}

public val LucideIcons.All.FlagTriangleRightDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FlagTriangleRight: ImageVector
    @Composable get() = FlagTriangleRightDefinition.asImageVector()
