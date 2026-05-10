package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("AlignHorizontalSpaceAround") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, 0.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, -2.0f, -0.0f)
                verticalLineToRelative(-10.0f)
                arcToRelative(2.0f, 0.0f, 0f, false, true, 2.0f, -0.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 22f)
                verticalLineTo(2f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 22f)
                verticalLineTo(2f)
            }
}

public val LucideIcons.All.AlignHorizontalSpaceAroundDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.AlignHorizontalSpaceAround: ImageVector
    @Composable get() = AlignHorizontalSpaceAroundDefinition.asImageVector()
