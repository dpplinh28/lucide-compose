package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MousePointer2Off") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(15.55f, 8.45f)
                lineToRelative(5.138f, 2.087f)
                arcToRelative(.5f, .5f, 0f, false, true, -.063f, .947f)
                lineToRelative(-6.124f, 1.58f)
                arcToRelative(2f, 2f, 0f, false, false, -1.438f, 1.435f)
                lineToRelative(-1.579f, 6.126f)
                arcToRelative(.5f, .5f, 0f, false, true, -.947f, .063f)
                lineTo(8.45f, 15.551f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 2f)
                lineTo(2f, 22f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(6.816f, 11.528f)
                lineToRelative(-2.779f, -6.84f)
                arcToRelative(.495f, .495f, 0f, false, true, .651f, -.651f)
                lineToRelative(6.84f, 2.779f)
            }
}

public val LucideIcons.All.MousePointer2OffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MousePointer2Off: ImageVector
    @Composable get() = MousePointer2OffDefinition.asImageVector()
