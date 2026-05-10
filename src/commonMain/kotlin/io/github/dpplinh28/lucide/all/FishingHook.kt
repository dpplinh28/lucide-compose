package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FishingHook") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(17.586f, 11.414f)
                lineToRelative(-5.93f, 5.93f)
                arcToRelative(1f, 1f, 0f, false, true, -8f, -8f)
                lineToRelative(3.137f, -3.137f)
                arcToRelative(.707f, .707f, 0f, false, true, 1.207f, .5f)
                verticalLineTo(10f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.414f, 8.586f)
                lineTo(22f, 7f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, 4.0f, 0f)
                arcToRelative(2.0f, 2.0f, 0f, true, false, -4.0f, 0f)
            }
}

public val LucideIcons.All.FishingHookDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FishingHook: ImageVector
    @Composable get() = FishingHookDefinition.asImageVector()
