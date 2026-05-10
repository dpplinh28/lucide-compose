package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Award") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(15.477f, 12.89f)
                lineToRelative(1.515f, 8.526f)
                arcToRelative(.5f, .5f, 0f, false, true, -.81f, .47f)
                lineToRelative(-3.58f, -2.687f)
                arcToRelative(1f, 1f, 0f, false, false, -1.197f, 0f)
                lineToRelative(-3.586f, 2.686f)
                arcToRelative(.5f, .5f, 0f, false, true, -.81f, -.469f)
                lineToRelative(1.514f, -8.526f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0f, 8.0f)
                arcToRelative(6.0f, 6.0f, 0f, true, false, 12.0f, 0f)
                arcToRelative(6.0f, 6.0f, 0f, true, false, -12.0f, 0f)
            }
}

public val LucideIcons.All.AwardDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Award: ImageVector
    @Composable get() = AwardDefinition.asImageVector()
